import jdk.jfr.StackTrace;

public class NameUndefinedException extends RuntimeException{


    //wyjątek, który powinien być rzucony,
    // jeśli ktoś przy próbie utworzenia obiektu Person przekaże do konstruktora
    // imię lub nazwisko będące nullem
    // lub mające mniej niż 2 znaki
}
