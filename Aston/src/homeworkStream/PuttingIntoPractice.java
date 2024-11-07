package homeworkStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PuttingIntoPractice {
    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1.Все транзакции за 2011 год, отсортированные по сумме (от меньшей к большей)
        Stream<Transaction> myStream1 = transactions.stream()
                .filter(x -> x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue));
        myStream1.forEach(System.out::println);
        System.out.println();
//
//        //2.Список неповторяющихся городов, в которых работают трейдеры
        Stream<String> myStream2 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct();
        System.out.println("Список неповторяющихся городов: ");
        myStream2.forEach(System.out::println);
        System.out.println();
//
//        //3.Все трейдеры из Кембриджа, отсортированные по именам
        Stream<Trader> myStream3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(x -> x.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName));
        myStream3.forEach(System.out::println);
        System.out.println();

//        //4.Строка со всеми именами трейдеров, отсортированные в алфавитном порядке
        String myStream4 = transactions.stream()
                .map(x -> x.getTrader().getName())
                .sorted().toList().toString();
//
//        //5.Существует ли хоть один трейдер из Милана.
        boolean myStream5 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        if(myStream5) {
            System.out.println("Есть трейдер из Милана");
        }
        else {
            System.out.println("Трейдера из Милана нет");
        }
        System.out.println();
//
//        //6.Сумма всех транзакций трейдеров из Кембриджа
        Stream<Integer> myStream6 = transactions.stream()
                .filter(x -> x.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue);
        Object[] array = myStream6.toArray();
        int sumValue = 0;
        for(Object ob : array) {
            sumValue += (int) ob;
        }
        System.out.println("Сумма транзакций трейдеров из Кембриджа: " + sumValue);
        System.out.println();

        //7.Максимальная сумма среди всех транзакций
        Stream<Transaction> myStream7 = transactions.stream();
        Optional<Transaction> maxSum = myStream7.max(Comparator.comparing(Transaction::getValue));
        maxSum.ifPresent(transaction -> System.out.println("Максимальная транзакция: " + transaction.getValue()));
        System.out.println();

        //8.Транзакция с минимальной суммой
        Stream<Transaction> myStream8 = transactions.stream();
        Optional<Transaction> minSum = myStream8.min(Comparator.comparing(Transaction::getValue));
        minSum.ifPresent(transaction -> System.out.println("Минимальная транзакиця: " + transaction));
    }
}
