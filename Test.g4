grammar Test;

input : row+ ;
row : field (',' field)* '\r'? '\n' ;

field
    : TEXT ;

TEXT   : ~[,\n\r"]+ ;
