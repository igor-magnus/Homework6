# User Service

## Описание

Данный проект представляет собой REST API сервис для управления пользователями, разработанный на базе Spring Boot.  
В рамках задания в проект были добавлены:

- **Swagger-документация (Springdoc OpenAPI):**  
  Все существующие эндпоинты API полностью документированы с помощью Swagger (Springdoc OpenAPI). Это позволяет легко изучать структуру и функционал API, а также тестировать его через web-интерфейс Swagger UI.

- **HATEOAS:**  
  Реализована поддержка HATEOAS (Hypermedia as the Engine of Application State).  
  Теперь ответы API содержат гипермедиа-ссылки, которые позволяют удобно перемещаться между ресурсами и выполнять дальнейшие действия, следуя REST-принципам.

---

## Требования

- Java 17 (или версия, используемая в проекте)
- Maven 3.6+ (или Gradle, если Вы используете его)
- Git
- СУБД (если используется; например, PostgreSQL, MySQL, H2)
- (Рекомендуется) Postman для тестирования запросов

---

## Инструкция по запуску

1. **Клонируйте репозиторий:**
   ```sh
   git clone https://github.com/igor-magnus/user-service.git
   cd user-service
   ```

2. **Соберите проект:**
   ```sh
   mvn clean package
   ```
   или, если Вы используете Gradle:
   ```sh
   ./gradlew build
   ```

3. **Запустите приложение:**
   ```sh
   mvn spring-boot:run
   ```
   или с помощью jar-файла:
   ```sh
   java -jar target/имя-jar-файла.jar
   ```

4. **Откройте Swagger UI:**  
   После запуска приложение будет доступно по адресу  
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  
   Здесь Вы сможете ознакомиться с документацией и протестировать все методы API через web-интерфейс.

5. **Основные эндпоинты REST API:**
   - Получить список пользователей:  
     `GET http://localhost:8080/api/users`
   - Добавить пользователя:  
     `POST http://localhost:8080/api/users`
   - (Другие эндпоинты смотрите в Swagger UI)

---

## HATEOAS

API реализует HATEOAS:  
Ответы содержат специальные гипермедиа-ссылки (`_links`), которые позволяют переходить к связанным ресурсам и выполнять действия напрямую из ответа.

---

## Настройка базы данных

Если в проекте используется база данных, все параметры подключения настраиваются в файле `src/main/resources/application.properties`.

**Пример для H2 (используется по умолчанию):**
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

Если Вы используете другую СУБД (PostgreSQL, MySQL и т.д.), настройте параметры согласно документации Spring Boot.

---

## Тестирование

Для тестирования API рекомендуется использовать Postman или встроенный Swagger UI.

---

## Пример запроса для создания пользователя

```json
POST http://localhost:8080/api/users
Content-Type: application/json

{
  "name": "Иван",
  "email": "ivan@example.com",
  "age": 25
}
```

---

## Автор

- [Песоцкий Игорь](https://github.com/igor-magnus)
