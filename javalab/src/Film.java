public class Film {
    public String name,language,lead_actor,category;
    public int duration;
    public Film(String name,String language,String lead_actor,String category,int duration){
        this.name=name;
        this.language=language;
        this.lead_actor=lead_actor;
        this.category=category;
        this.duration=duration;
    }
    public String getName(){
        return name;
    }
    public String getlang(){
        return language;
    }
    public String getlead(){
        return lead_actor;
    }
    public String getcategory(){
        return category;
    }
    public int getdur(){
        return duration;
    }
    
}
