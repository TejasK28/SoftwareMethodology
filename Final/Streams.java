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
            

              





















        // testing

        //This is my original List<Integer> usuing `Arrays.asList()`
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

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