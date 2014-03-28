module.exports = {

  fizzBuzz: function (res, callback) {
    asyncFor(1, 100, function (index, callback) {
      fizz(index, function (isFizz) {
        buzz(index, function (isBuzz) {
          if (isFizz && isBuzz) {
            res.write('FizzBuzz\n');
          } else if (isFizz) {
            res.write('Fizz\n');
          } else if (isBuzz) {
            res.write('Buzz\n');
          } else {
            res.write(index + '\n');
          }
          callback();
        });
      });
    }, callback);
  }

};

function buzz (number, callback) {
  process.nextTick(function () {
    callback(number % 5 === 0);
  });
}

function fizz (number, callback) {
  process.nextTick(function () {
    callback(number % 3 === 0);
  });
}

function asyncFor (start, end, iterator, callback) {
  if (start <= end) {
    process.nextTick(function () {
      iterator(start, function () {
        asyncFor(start + 1, end, iterator, callback);
      });
    });
  } else {
    callback();
  }
}