import java.io.*;
import java.util.*;

public class VotingWinner {

    public static void main(String[] args) {

        Map<String, Integer> voteMap = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < args.length; i++) {

            if (voteMap.containsKey(args[i])) {
                voteMap.put(args[i], voteMap.get(args[i]) + 1);
            } else {
                voteMap.put(args[i], 1);
            }
        }


       String winner  = Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println(winner);


    }
}