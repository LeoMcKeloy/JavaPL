# JavaPL
1) Приложение по поиску всех строк, в которых пристутствует ключенове слово:
	На вход приложение принимает следующие аргументы:
	Путь до файла
	Название итогового фалйа
	Искомое слово(Например, "ERROR")
	В приложении есть файл с логами, на котором можно будет тестировать программу
2) Попробуем написать очень простую "заглушку":
	Приложение висит на localhost:8080 и ждет GET запроса. На любой запрос отвечать HTTP кодом 200("OK") и строкой с текущей датой и временем