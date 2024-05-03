import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams
{

    public static void main(String [] args)
    {

        /*
         * I created a list of movies of type Move via `Arrays.asList(T o1, T o2...)`
         */

        List<Movie> movies = Arrays.asList(
        new Movie("Mad Max: Fury Road",2015,
        5,Movie.Genre.ACTION),
        new Movie("Straight Outta Compton", 2015,
        5,Movie.Genre.DRAMA),
        new Movie("Fifty Shades of Grey", 2015,
        1,Movie.Genre.DRAMA),
        new Movie("American Sniper", 2014,
        4,Movie.Genre.ACTION),
        new Movie("Transcendence", 2014,
        1,Movie.Genre.THRILLER),
        new Movie("Conan The Barbarian", 2011,
        2,Movie.Genre.ADVENTURE),
        new Movie("The Last Airbender", 2010,
        2,Movie.Genre.ADVENTURE),
        new Movie("Harry Potter and the Deathly Hallows: Part 1", 2010,
        4,Movie.Genre.ADVENTURE),
        new Movie("Sicario", 2015,
        4,Movie.Genre.MYSTERY),
        new Movie("The Gift", 2000,
        3,Movie.Genre.MYSTERY)
        );


        /*
         * Let's try and find bad movies
         * 
         * We're using `.filter(Predicate p)` returns a stream
         * 
         * We're using `.map(Function f)` returns a stream
         * 
         * This isn't enough so we use `.collect(toList())` returns a list of whatever we have
         */
         List<String> badMovieNames = movies.stream()
                            .filter(m -> m.getRating() < 3)
                            .map(m -> m.getName())
                            .collect(Collectors.toList());


        System.out.println("[BAD MOVIES] : " + badMovieNames);

        /*
         * We also have `.parallelStream()`
         * 
         * but it's useful for really big programs
         */


         /*
          * What if we wanted only 2 bad movies?
          * 
          * `.limit(int x)`
          */

          badMovieNames = movies.stream()
                            .filter(m -> m.getRating() < 3)
                            .map(m -> m.getName())
                            .limit(2)
                            .collect(Collectors.toList());


        System.out.println("[.LIMIT(2)] : " + badMovieNames);


        /*
         * This is basically an example of short circuiting
         */
        List<String> names =
        movies.stream()
         .filter(m -> {
         //System.out.println("filtering " + m.getName());
         return m.getRating() < 3;
         })
         .map(m -> {
         //System.out.println("mapping " + m.getName());
         return m.getName();
         })
         .limit(2)
         .collect(Collectors.toList());
        
         System.out.println(names);


         /*
          * Terminal operations return a primitive, object or void
          */

          /*
           * .count returns a long int
           */

          int adventureMoviesCount = (int)
            movies.stream()
            .filter(m -> m.getCategory() == Movie.Genre.ADVENTURE)
            .count(); // returns a long int

            System.out.println("\nTHE COUNT IS: " + adventureMoviesCount);



            /*
             * We see `.sorted(key)`
             * `.sorted(key)` takes in a comparator
             * 
             * We also see `.forEach(Consumer s)`
             * `comparing` is from the Comparator interface
             */
            movies.stream()
            .filter(m -> m.getCategory() == Movie.Genre.ACTION)
            .sorted(Comparator.comparing(Movie::getName).reversed())
            .map(Movie::getName)
            .forEach(System.out::println);



            /*
            This is an example of Stream.of returning a Stream<T>
             */
            Stream<String> newNames = Stream.of("Spotlight","Mad Max","Martian", "Revenant","Big Short","The Danish Girl");
            


            /*
             * Passing an int [] to Arrays.stream returns an IntStream
             * 
             * Also can do IntStream.of(int [])
             */
            int [] primes = {1,2,3,4,5,6,7,8,9};

            IntStream primesIntStream = Arrays.stream(primes);

            System.out.println("THE SUM OF INT STREAM IS: " + primesIntStream.sum());




            /*
             * IntStream.rangeClosed(x,y)
             * 
             * returns an IntStream not a Stream<Integer>
             */

             IntStream.rangeClosed(0, 5).forEach(System.out::println);



             /*
              * Files.lines(Paths.get("abc.txt"))

              returns a Stream<String>
              */

            // try (Stream<String> lines = Files.lines(Paths.get("abc.txt"))) {
            //     //lines.forEach(System.out::println);
            // } catch (IOException e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }



            /*
             * Stream.iterate(seed, unary function)
             * 
             * will be infinite
             */

             Stream.iterate("*", s -> s + "*").limit(6).forEach(System.out::println);


             /*
              * Stream.generate(supplier)

              similar to .iterate as it will generate an infinite sequence
              */

              Stream.generate(Math::random).limit(5).forEach(System.out::println);


            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


            /*
             * Notice how the more complicated reduce return an int
             */
            int x = list.stream().reduce(0, (a,b) -> a+b);

            System.out.println("THE SUM OF ALL INTS IS: " + x);


            /*
             * How we find the # of characters
             */

            List<String> poem = Arrays.asList("First", 
                                "Second",
                                "Third",
                                "Fourth",
                                "Fifth");    
                                
            Optional<Integer> o = poem.stream()
                    .map(line -> line.split("").length).reduce(Integer::sum);

           

            poem.stream()
                    .map(line -> line.split("").length).reduce(Integer::sum)
                    .ifPresent(System.out::println);




        /*
         * Reduce on an intStream
         */

        IntStream is = IntStream.rangeClosed(2,10);
        int fact = is.reduce(1,(a,b) -> a+b);

        System.out.println("THE SUM OF THE INTS IS: " + fact);

        /*
         * We can also map to int
         */

        System.out.println("MAP TO INT: " + poem.stream()
                        .mapToInt(line -> line.split("").length)
                        .reduce(0, (a,b) -> a + b));



        /*
         * Now we do a string [][] arrays as list
         * 
         * We see distinct in action
         */

         String[][] cars =
        {
        {"Honda","Civic","2019"},
        {"Toyota","Camry","2019"},
        {"Ford","Fusion","2019"},
        {"Subaru","Forrester","2019"},
        {"Honda","Accord","2019"},
        {"Ford","Focus","2019"},
        {"Honda","Pilot","2019"}
        };

        Stream<String[]> strArr = Arrays.stream(cars);// returns a Stream<String[]>

        Stream<String> namesOfCars = strArr.map(m -> m[0]).distinct();

        namesOfCars.forEach(System.out::println);

                

        /*
         * will return a Stream<int[]>
         */

        List<Integer> l1 = Arrays.asList(2,3,7,9);

        Stream <int []> l1arr = l1.stream()
        .map(i -> new int[]{1,i});

        l1arr.forEach(a -> System.out.println(Arrays.toString(a)));


        /*
         * Stream of stream of int []
         */

        List<Integer> l11 = Arrays.asList(2,3,7,9);
        List<Integer> l22 = Arrays.asList(4,5,8);

        /*
         * Notice the int[]
         */
        Stream<Stream<int[]>> strmofstrm = l11.stream().map(i -> l22.stream().map(j -> new int[]{i,j}));
        Stream<int[]> strmofstrmflatmap = l11.stream().flatMap(i -> l22.stream().map(j -> new int[]{i,j}));



        /*
         * Flatten strings
         */
























        // testing

        /*
         * Simple stream example where we filter for odd numbers and collect
         * in a list
         */
        List<Integer> newList = list.stream()
                                .filter(i -> i % 2 == 1)
                                .collect(Collectors.toList());



        /*
        * Using `findAny` here which should return an optional of the integer
        */    
        Optional<Integer> numberThree = list.stream()
                                .filter(i -> i == 3).findAny();



        /*
         * If the optional returned is not empty, we will
         * print it out or else state it's empty
         */
        if(numberThree.isPresent())
        {
            System.out.println(numberThree.get());
        }
        else
        {
            System.out.println("Nothing found :()");
        }


        




        







    }



}