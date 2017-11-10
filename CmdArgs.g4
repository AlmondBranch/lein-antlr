grammar CmdArgs;

input : entry (' '* entry)* ' '*;
entry : (REGULAR_ARG | SINGLE_QUOTED_ARG | DOUBLE_QUOTED_ARG);

REGULAR_ARG       : ~('\''|'"'|' ')+;
DOUBLE_QUOTED_ARG : '"' ( '\\"' | ~('"') )* '"';
SINGLE_QUOTED_ARG : '\'' ( '\\\'' | ~('\'') )* '\'';

