000010 IDENTIFICATION  DIVISION.                                        XXXXXXXX
       PROGRAM-ID.     UnstringSample.                                  XXXXXXXX
       ENVIRONMENT     DIVISION.                                        XXXXXXXX
       CONFIGURATION SECTION.                                           XXXXXXXX
       SPECIAL-NAMES.   DECIMAL-POINT IS COMMA.                         XXXXXXXX
       INPUT-OUTPUT    SECTION.                                         XXXXXXXX
       DATA            DIVISION.                                        XXXXXXXX
       WORKING-STORAGE SECTION.                                         XXXXXXXX
       01 ABCDE-RECORD.                                                 XXXXXXXX
XXXXXX  02 ABCDE-REC.                                                   XXXXXXXX
        03 ABCDE-COMMON.                                                XXXXXXXX
           05 ABCDE-DETAILS.                                            XXXXXXXX
             10 ABCDE-RECORD-ABC.                                       XXXXXXXX
                15 ABCDE-PRI-ABC.                                       XXXXXXXX
                   20 ABCDE-ABC-AAAAAAAA         PIC X(02).             XXXXXXXX
                   20 ABCDE-ABC-ACCT-ABCS.                              XXXXXXXX
                      25 ABCDE-ABC-ABC-1         PIC X(02).             XXXXXXXX
                      25 ABCDE-ABC-ABC-2         PIC X(03).             XXXXXXXX
                      25 ABCDE-ABC-ABC-3         PIC X(03).             XXXXXXXX
                      25 ABCDE-ABC-ABC-4         PIC X(04).             XXXXXXXX