
public class Principal {
public static void main(String[] args) {
	
	Serie SerieList[]=new Serie[5];
    Videojuego GameList[]=new Videojuego[5];
    
    SerieList[0]=new Serie();
    SerieList[1]=new Serie("the rain", "Bryan occoner");
    SerieList[2]=new Serie("Mimic", 7 , "Terror", "Angel bratt");
    SerieList[3]=new Serie("focus", 14 ,"Suspenso", "Maria ayala");
    SerieList[4]=new Serie("Stranger Things", 2, "bitlink", "Vince Gilligan");

    GameList[0]=new Videojuego();
    GameList[1]=new Videojuego("alien insolation", 20, "Terror", "Square Enix");
    GameList[2]=new Videojuego("Call of dutty", "Santa Monica");
    GameList[3]=new Videojuego("Lef 4 dead 2", 70, "Plataforma", "Xbox 360");
    GameList[4]=new Videojuego("Megaman", 100, "aventura", "Gameboy ");
    
    SerieList[1].entregar();
    SerieList[4].entregar();
    GameList[0].entregar();
    GameList[3].entregar();
    
    int entregados=0;
    
    for(int i=0;i<SerieList.length;i++){
        if(SerieList[i].isEntregado()){
            entregados+=1;
            SerieList[i].devolver();

        }
        if(GameList[i].isEntregado()){
            entregados+=1;
            GameList[i].devolver();
        }
    }

    System.out.println("Hay un total de " + entregados + " articulos entregados");
    
    Serie serieMayor=SerieList[0];
    Videojuego videojuegoMayor=GameList[0];
    
    for(int i=1;i<SerieList.length;i++){
        if(SerieList[i].compareTo(serieMayor)==Serie.mayor){
            serieMayor=SerieList[i];
        }
        if(GameList[i].compareTo(videojuegoMayor)==Videojuego.mayor){
            videojuegoMayor=GameList[i];
        }

    }
    
    System.out.println(videojuegoMayor);
    System.out.println(serieMayor);
}
}
