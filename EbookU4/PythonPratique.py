def main():
     f= open("testepython.txt","w+")
     #f=open("testepython.txt","a+")
     for i in range(10):
         f.write("This is line %d\r\n" % (i+1))
     f.close()

     #Abre o arquivo novamente e lê o conteúdo
     #f=open("testpython.txt", "r")
     #   if f.mode == 'r': 
     #     contents =f.read()
     #     print contents

     #ou, lê linha por linha
     #fl =f.readlines()
     #for x in fl:
     #print x
if __name__== "__main__":
  main()