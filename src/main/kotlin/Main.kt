fun main(args: Array<String>) {
    word()
    var result = introduction("Sonia", 20)
    println(result)
    
    var result1 = wordLength()
    println(result1)
    
    confirmName("Sonia")

}


//Function that prints the first, third and fourth characters of the string
fun word(){
  var name = "akirachix"
  println("${name[0]}${name[2]}${name[3]}")
}


//Function that returns a string
fun introduction(name: String, age: Int): String {
  var sayHi = "Hi, My name is $name and I am $age old."
  return sayHi
}


//Function that returns length of a string
fun wordLength(): Int {
  var country = "Rwanda"
  return country.length
}


// Function that confirms if it's my name or not
fun confirmName(name: String){

    if(name == "Sonia"){
    println("that's me")
  }
  else{
    println("I don’t know who that is")
  }
}


