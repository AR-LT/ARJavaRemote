package advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();
        // .offer idedam - eil4je yra principas FIFA (first in - first out)
        pokemons.offer("Charmander");
        pokemons.offer("Pikachu");
        pokemons.offer("Pikachu");

        System.out.println(pokemons.peek());
        // poll metodas i6ima
        System.out.println(pokemons.poll()); // i64me ir atspauzdina ka iseme
        System.out.println(pokemons.peek()); // spausdina pirma kas eina po isemimo


    }
}
