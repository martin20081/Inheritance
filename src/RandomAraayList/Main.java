package RandomAraayList;

public class Main {


    public static void main(String[] args) {



        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();
        randomArrayList.add(120);
        randomArrayList.add(12);
        randomArrayList.add(5);


        System.out.println(randomArrayList.getRandomElement());
    }
}
