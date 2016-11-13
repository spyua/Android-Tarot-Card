package com.example.spyua.tarotspreads;

/**
 * Created by spyua on 2016/9/9.
 */
public class TarlotCardsSetting {

    public int[] image_set(){
        int []image;
        image= new int[]{
                R.drawable.maj00,R.drawable.maj01,R.drawable.maj02,R.drawable.maj03,
                R.drawable.maj04,R.drawable.maj05,R.drawable.maj06,R.drawable.maj07,
                R.drawable.maj08,R.drawable.maj09,R.drawable.maj10,R.drawable.maj11,
                R.drawable.maj12,R.drawable.maj13,R.drawable.maj14,R.drawable.maj15,
                R.drawable.maj16,R.drawable.maj17,R.drawable.maj18,R.drawable.maj19,
                R.drawable.maj20,R.drawable.maj21,

                R.drawable.cups01,R.drawable.cups02,R.drawable.cups03,R.drawable.cups04,
                R.drawable.cups05,R.drawable.cups06,R.drawable.cups07,R.drawable.cups08,
                R.drawable.cups09,R.drawable.cups10,R.drawable.cups11,R.drawable.cups12,
                R.drawable.cups13,R.drawable.cups14,

                R.drawable.pents01,R.drawable.pents02,R.drawable.pents03,R.drawable.pents04,
                R.drawable.pents05,R.drawable.pents06,R.drawable.pents07,R.drawable.pents08,
                R.drawable.pents09,R.drawable.pents10,R.drawable.pents11,R.drawable.pents12,
                R.drawable.pents13,R.drawable.pents14,

                R.drawable.swords01,R.drawable.swords02,R.drawable.swords03,R.drawable.swords04,
                R.drawable.swords05,R.drawable.swords06,R.drawable.swords07,R.drawable.swords08,
                R.drawable.swords09,R.drawable.swords10,R.drawable.swords11,R.drawable.swords12,
                R.drawable.swords13,R.drawable.swords14,

                R.drawable.wands01,R.drawable.wands02,R.drawable.wands03,R.drawable.wands04,
                R.drawable.wands05,R.drawable.wands06,R.drawable.wands07,R.drawable.wands08,
                R.drawable.wands09,R.drawable.wands10,R.drawable.wands11,R.drawable.wands12,
                R.drawable.wands13,R.drawable.wands14
        };
       return image;
    }

    public String [] string_set(){
        String [] imgText;
        imgText = new String[]{
                "The Fool", "The Magician", "The High Priestess","The Empress","The Emperor","The Hierophant","The Lovers","The Chariot","Strength","The Hermit","Wheel of Fortune",
                "Justice","The Hanged Man","Death","Temperance","The Devil","The Tower","The Star","The Moon","The Sun","Judgement","The World",

                "Ace of Cups","Two of Cups","Three of Cups","Four of Cups","Five of Cups","Six of Cups","Seven of Cups","Eight of Cups","Nine of Cups","Ten of Cups",
                "Page of Cups","Knight of Cups","Queen of Cups","King of Cups",

                "Ace of Pentacles","Two of Pentacles","Three of Pentacles","Four of Pentacles","Five of Pentacles","Six of Pentacles","Seven of Pentacles","Eight of Pentacles","Nine of Pentacles","Ten of Pentacles",
                "Page of Pentacles","Knight of Pentacles","Queen of Pentacles","King of Pentacles",

                "Ace of Swords","Two of Swords","Three of Swords","Four of Swords","Five of Swords","Six of Swords","Seven of Swords","Eight of Swords","Nine of Swords","Ten of Swords",
                "Page of Swords","Knight of Swords","Queen of Swords","King of Swords",

                "Ace of Wands","Two of Wands","Three of Wands","Four of Wands","Five of Wands","Six of Wands","Seven of Wands","Eight of Wands","Nine of Wands","Ten of Wands",
                "Page of Wands","Knight of Wands","Queen of Wands","King of Wands",
        };

        return imgText;
    }

}
