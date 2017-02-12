<?php

for($i=1;$i<=100;$i++){
    if(($i % 15)==0){ print 'FizzBuzz;'."\n<br />"; }
    elseif(($i % 3)==0){ print 'Fizz;'."\n<br />"; }
    elseif(($i % 5)==0){ print 'Buzz;'."\n<br />"; }
    else{ print $i."\n<br />"; }
}
?>
