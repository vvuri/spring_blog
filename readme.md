## Java Spring MVC 
1. Зайти на сайт и создать шаблон https://start.spring.io/
2. Открываем в IDEA и правим pom.xml
3. Выбираем MVC
4. Шаблонизатор https://www.thymeleaf.org/
5. application.property - MySQL connect config
6. Alt + Ins - generate Getter and Setter
7. controoler - связывание линков и шаблонов
8. models - описание таблиц БД
9. repo - 1:1 модель(Post) - репозиторий interface (PostRepository)
10. Таблица создастся сама при запуске 
   


#### Курс с видео 
https://itproger.com/course/java-spring

#### MySQL
```bash
$ docker pull mysql
$ docker run -p 3306:3306 --name srv-mysql -e MYSQL_ROOT_PASSWORD=pw1234 -d mysql 
$ docker exec -it srv-mysql bash
```
configure MySQL:
````bash
# mysql --version
mysql  Ver 8.0.21 for Linux on x86_64 (MySQL Community Server - GPL)
````
GUI [MySQL Workbench](https://dev.mysql.com/downloads/workbench/):
- connect as root:pw1234
- port 3306
- create new a schema: spring_db
- utf_8 - utf_8_general_ci
создали только БД, все остальное через java






