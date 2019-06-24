object Sample17{
                    def main(args:Array[String]):Unit = {
                                        val a = 5
                                        val b = 8
                                        println( a + "+" + b + "=" +Sample17.sum(a,b))
                                        Sample17.greet()
                    }

                    def sum(x:Int, y:Int):Int = {
                                        x + y
                    }

                    def greet() = println("Good mornign!")
}