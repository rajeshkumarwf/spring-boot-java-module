module spring.boot.java.module {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;

    opens com.example.springbootjavamodule;
}