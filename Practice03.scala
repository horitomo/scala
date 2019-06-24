object Practice03{
                    def main(args:Array[String]){
                                        // 答え変数（１から１０までの値をランダムに設定）
                                        val answer = scala.util.Random.nextInt(10)+1
                                        var input = 0
                                        var count = 3
                                        while(count > 0 && answer != input){
                                                            
                                                            println("数値を入力してください（残り"+count+"回")
                                                            count -=1
                                                            input = scala.io.StdIn.readInt
                                                            var result =
                                                            if(answer < input){
                                                                                "答えは"+input+"より小さい値です"
                                                            }else if(answer > input){
                                                                                "答えは"+input+"より大きい値です"
                                                            }else if(answer == input){
                                                                                "正解です。答えは"+input+"でした"
                                                            }
                                                            println(result)
                                        }
                                        if(count == 0 && answer != input){
                                                            println("残念でした。正解は"+answer+"でした")
                                        }
                    }
}