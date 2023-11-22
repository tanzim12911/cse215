# cse215

ch_11: q2
ch_12: q5
ch_13: q7, q9, q11


TextIO----> Create text file:
            File, FileWriter [fw.write()], Scanner(new File()) | Remember to close FW & use \n at end of writing.

            **Cant direclty use read.hasNext() in sysout, must use a variable before.

BinaryIO--> Dealing with integers from 0 to 255:                    |
            
            OutputStream[+write(int)], InputStream[+read() : int]   |
            
            *FileOutputStream, FileInputStream                      |
                                                                
            -----------------------------------------------------------

            Dealing with premitive types:                           |

            *FileOutputStream, FileInputStream                      |

            DateOutputStream[+readInt() : int, +readUTF() : String] |
            DateInputStream[+writeInt(int i), +writeUTF(String s)]
            -----------------------------------------------------------

