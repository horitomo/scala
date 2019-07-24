object Sample19{
                    def main(args:Array[String]){
                                        val p1 = new Person
                                        val p2 = new Person
                                        p1.name = "山田"
                                        p1.age = 24
                                        p2.name = "田中"
                                        p2.age = 22
                                        p1.introduce()
                                        p2.introduce()
                    }
}

class Person{
                    var name = ""
                    var age = 0
                    def introduce(){
                                        println("私は" + name + "で年齢は" + age + "です")
                    }
}