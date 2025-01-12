//    Beste heer Jansen,
//    Bijgevoegd de opdrachten 6A en 6B

    //Opdracht 1:
    public Game zoekGameOpNaam(String checkIfGameisInBezit) {
        for (int i = 0; i < mijnGame.size(); i++) {
            Game opgehaaldeGame = mijnGame.get(i);
            if (opgehaaldeGame.getNaam().equals(checkIfGameisInBezit)) {
                return opgehaaldeGame;
            } else {
                return null;
            }
        }
        return null;
    }

    //    Opdracht 2
    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> games) {
        ArrayList<Game> nietInBezit = new ArrayList<>();

        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            if (!mijnGame.contains(game)) {
                nietInBezit.add(game);
            }
        }
        return nietInBezit;
    }

