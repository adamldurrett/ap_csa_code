class Kingdom{
    // inherited attributes
    public String name;
    public String trait;

    // not inherited attributes
    private ArrayList<Phylum> phyla;

    public Kingdom(String n, String t){
        name = n;
        trait = t;
        phyla = new ArrayList<Phylum>();
    }

    public void addPhylum(Phylum p){
        phyla.add(p);
    }

    public void printTrait(){
        System.out.println(trait);
    }
}