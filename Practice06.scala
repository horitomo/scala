object Practice06{
	def main(args:Array[String]){
		val book = new Book
		book.title = "楽しいScala"
		book.author = "山田太郎"
		book.price = 2980
		println(book.getInfo)
		
	}

	class Book{
		var title = ""
		var author = ""
		var price = 0
		def getInfo() :String={
			var bookInfo = "タイトル：" + title + "\n" + "著者：" + author + "\n" + "価格：" + price
			return bookInfo
		}
	}
}
