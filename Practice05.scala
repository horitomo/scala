object Practice05{
                    def main(args:Array[String]){
                                        // 円の半径変数の宣言
                                        val r = 5.0

                                        // 円の面積出力
                                        println("半径"+ r + "の円の面積は"+getArea(r))

                                        val base = 9.0
                                        val height = 5.0

                                        println("底辺" + base + "高さ" + height + "の三角形の面積は"+getArea(base,height))

                                        val upperBase = 8.0
                                        val lowerBase = 10.0

                                        // 台形の面積を出力
                                        println("上底" + upperBase + "下底" + lowerBase + "高さ" + height + "の台形の面積は"+getArea(upperBase,lowerBase,height))
                    }

                    def getArea(x:Double):Double={
                                        x * x * 3.14
                    }

                    def getArea(x:Double, y:Double):Double= {
                                        x * y /2
                    }
                    
                    def getArea(x:Double, y:Double, z:Double):Double = {
                                        (x + y)* z /2
                    }
}