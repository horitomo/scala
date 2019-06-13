object Sample09{
                    def main(args:Array[String]){
                                        var x1 = 10
                                        // x1 = "こんにちは"　…Int型なのでエラー
                                        x1 = 20
                                        var x2 = "こんばんは"
                                        // x2 = 100 …String型なのでエラー
                                        x2 = "さようなら"
                                        println(x1)
                                        println(x2)
                    }
}