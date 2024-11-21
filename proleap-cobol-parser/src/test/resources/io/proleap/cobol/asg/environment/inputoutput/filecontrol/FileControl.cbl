 IDENTIFICATION DIVISION.
 PROGRAM-ID. FILECONTROL.
 ENVIRONMENT DIVISION.
    INPUT-OUTPUT SECTION.
       FILE-CONTROL.
       SELECT TEACHER
       ASSIGN TO 'teacher.txt'
       ORGANIZATION IS RECORD INDEXED
       PADDING CHARACTER IS '-'
       RECORD DELIMITER IMPLICIT
       ACCESS MODE IS DYNAMIC
       RECORD SOMEDATANAME PASSWORD SOMEPASSWORD
       ALTERNATE RECORD SOMEDATANAME2 PASSWORD SOMEPASSWORD
       RESERVE 10
       FILE STATUS IS SOMEFILESTATUS1 SOMEFILESTATUS2
       RELATIVE KEY SOMEDATANAME
       PASSWORD SOMEPASSWORD.