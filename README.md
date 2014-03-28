# FizzBuzzWebScaleEdition

Web scalable version of [FizzBuzzEnterprizeEdition](https://github.com/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition).

To handle a lot of clients we must use something web scalable. Everyone of course heard cool stories about node.js. Some big companies such as Wallmart, Ebay, Groupon already moved from slow, old, nonscalable java to modern, new and web scalable node.js. They cannot be wrong. So, we must too move from java to node.js.

## Benchmarks

Look at this:

![benchmark](https://raw.githubusercontent.com/schfkt/FizzBuzzEnterpriseEdition/master/images/benchmark.png "Amazingly fast and scalable node.js can handle a lot of requests")

This is amazing! So fast and damn scalable!

For that benchmark I used Apache Benchmark:
```
ab -n 50000 -c 1000 http://127.0.0.1:1337/
```

Let's compare it with java:

```
> ab -n 50000 -c 1000 java
ab: invalid URL
Usage: ab [options] [http[s]://]hostname[:port]/path
 ....
```

Java version doesn't work! It cannot handle a lot of requests, in fact it can't handle even one!

So, it is obvious that our migration from java to node.js is right choice.

## FizzBuzz

FizzBuzz is a game that has gained in popularity as a programming assignment to
weed out non-programmers during job interviews. The object of the assignment is
less about solving it correctly according to the below rules and more about
showing the programmer understands basic, necessary tools such as
`if`-/`else`-statements and loops. The rules of FizzBuzz are as follows:

For numbers 1 through 100,

* if the number is divisible by 3 print Fizz;
* if the number is divisible by 5 print Buzz;
* if the number is divisible by 3 and 5 (15) print FizzBuzz;
* else, print the number.
