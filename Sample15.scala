object Sample15{
                    def main(args:Array[String]){
                                        val month = 7
                                        val season =
                                        if(month >= 3 && month <= 5){
                                                            "春"
                                        }else if(month >= 6 && month <= 8){
                                                            "夏"
                                        }else if(month >= 9 && month <= 11){
                                                            "秋"
                                        }else if( month == 12 || month == 1 || month == 2){
                                                            "冬"
                                        }else {
                                                            "不明です"
                                        }

                                        println(month + "月は"+ season + "です")
                    }
}