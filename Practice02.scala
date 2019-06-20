object Practice02{
                    def main(args:Array[String]){
                                        println("身長を入力してください")
                                        val height = scala.io.StdIn.readDouble
                                        println("体重を代入してください")
                                        val weight = scala.io.StdIn.readDouble

                                        val heightM = height / 100
                                        val bmi = weight / (heightM*heightM)

                                        println("あなたのBMIの値は"+bmi+"です")
                                        val resurt =
                                        if(bmi >= 26.5){
                                                            "肥満"
                                        }else if( bmi >= 24 && bmi <26.5){
                                                            "太り気味"
                                        }else if( bmi >= 20 && bmi < 24){
                                                            "普通"
                                        }else{
                                                            "スリム"
                                        }
                                        println(resurt)
                    }
}