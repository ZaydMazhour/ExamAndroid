package com.example.notespro;

public class Food {
    private int Image;
    private String Name;
    private String Description;


    public Food(int mImage, String mName, String mDescription) {
        this.Image = mImage;
        this.Name=mName;
        this.Description=mDescription;
    }
    public void setImage(int Image){
        this.Image = Image;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public void setDescription(String Description){
        this.Description = Description;
    }


    public int getmImage() {
        return Image;
    }

    public String getmName() {
        return Name;
    }

    public String getmDescription() {
        return Description;
    }
}
