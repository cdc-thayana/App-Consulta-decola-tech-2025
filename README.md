 class Account {
        - String login
        - String password
    }

    class User {
        - String cpf
        - String name
        - String email
        - String phone
    }

    class Course {
        - String courseCode
        - String courseName
        - String description
        - List<String> features
    }

    class News {
        - String title
        - String content
        - String publicationDate
        - String author
    }

    Account "1" -- "1" User : belongs to
    User "1" -- "*" Course : can enroll in
    Course "1" -- "*" News : can have
