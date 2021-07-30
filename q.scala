import java.util.Scanner;
object  main{
    def main(args: Array[String]): Unit = {
        val scanner = new Scanner(System.in)
         
        //get input from user to alphabet
        // print("Enter alphabet:")
        // val alphabet=scanner.nextLine()
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

        //get string from user
        print("Enter string:")
        val s:String = scanner.nextLine()
        //string for the task you can set it as your own one
        // val s="bhashitha"

        //get user input for key
        print("Enter Key value:")
        val key:Int = scanner.nextInt()

        //key means how many shifts want to do
        // val key:Int=2


        //call encryption function
        val es=cipher(E,s,key,alphabet)
        println("\n\nencrypted string: " + es+"\n")

        //call decryption function
        val ds=cipher(D,es,key,alphabet)
        println("decrypted sting same as real string: " + ds + "\n\n")
    }

    //function for encryption 
    val E=(c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)+key)%a.size)

    //function for decryption 
    val D=(c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)-key)%a.size)

    //function for implement cipher algorithm
    val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

}