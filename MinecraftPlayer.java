class MinecraftPlayer{
    String username;
    int mobKills;
    int daysSinceLastDeath;
    boolean dragonKilled;
    int health = 20;

    MinecraftPlayer(String name){
        username = name;
        mobKills = 0;
        daysSinceLastDeath = 0;
        dragonKilled = false;
        printWelcome();
    }
    
    void printWelcome(){
        System.out.println("Welcome " + username + ".");
    }

    int damage(int dmg){
        health = health - dmg;
        System.out.println("Ooof! " + username + ": " + health);
        return health;
    }

    int getHealth(){
        // returns the health of the player
        return health;
    }

    void setHealth(int x){
        health = x;
    }

    void damage_other(MinecraftPlayer other){
        other.damage(5);
    }

    
    /*String username;
    String skin;
    int health = 20;
    boolean right_handed;
    int total_dirt = 0;

    MinecraftPlayer(){
        username = "Minecraft Player";
        skin = "steve";
        right_handed = true;
    }
    
    MinecraftPlayer(String user, String skin_name, boolean r_handed){
        username = user;
        skin = skin_name;
        right_handed = r_handed;
    }

    void dig_dirt(){
        total_dirt++;
        System.out.println(username + " has digged " + total_dirt + " blocks.");
    }
    
    int get_health(){
        System.out.println(username + " has " + health + " health.");
        return health;
    }

    int set_health(int change){
        health = health + change;
        return health;
    }
    
    void dmg_other(MinecraftPlayer plyr){
        plyr.set_health(-5);
        System.out.println(plyr.username + ": Oof!");
    }*/
    
    
    
    
}