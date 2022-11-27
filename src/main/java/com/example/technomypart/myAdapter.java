package com.example.technomypart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {


    ArrayList<myDailyActivity> myDailyActivity;
    ArrayList<Categories> myCategories;
    ArrayList<Items> myItems;
    Context context;
    int image;
    String type;
    int xx;
    int xy;
    private RecyclerViewClickListener listener;

    public myAdapter(Context ct, ArrayList<myDailyActivity> mymyDailyActivity, int img,String t){

        myDailyActivity = mymyDailyActivity;
        context = ct;
        image = img;
        type = t;

    }

    public myAdapter(Context ct,ArrayList<Categories> mmyCategories, int img,String t,int x,RecyclerViewClickListener listener){
        myCategories = mmyCategories;
        context = ct;
        image = img;
        type = t;
        xx = x;
        this.listener = listener;

    }

    public myAdapter(Context ct,ArrayList<Items> mmyItems, int img,String t,int x,RecyclerViewClickListener listener,int xxx){
        myItems = mmyItems;
        context = ct;
        image = img;
        type = t;
        xx = x;
        this.listener = listener;
        xy = xxx;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.showinlistviewone,parent,false);
        if (type.equals("one")){
           view = inflater.inflate(R.layout.showinlistviewone,parent,false);
        }else if (type.equals("two")){
            view = inflater.inflate(R.layout.categoriesbubbles,parent,false);
        }else if (type.equals("three")){
            view = inflater.inflate(R.layout.showadditems,parent,false);
        }

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (type.equals("one")){
            holder.date.setText(myDailyActivity.get(position).getDate());
            holder.amount.setText(myDailyActivity.get(position).getNumItems()+"");
//            holder.myImage.setImageResource(image);
        }else if (type.equals("two")){

            holder.lbl.setText(myCategories.get(position).getName()+"");
            holder.myImgTwo.setImageResource(myCategories.get(position).getImg());
        }else if (type.equals("three")){

            holder.lbl.setText(myItems.get(position).getName()+"");
            holder.myImgTwo.setImageResource(myItems.get(position).getImg());
        }

    }

    @Override
    public int getItemCount() {
        if (type.equals("one")){
            return myDailyActivity.size();
        }else if (type.equals("two")){
            return myCategories.size();

        }else if (type.equals("three")){
            return myItems.size();
        }
        return 0;
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView date;
        TextView amount;
        ImageView myImage;

        ImageView myImgTwo;
        TextView lbl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            if (type.equals("one")){
                date = itemView.findViewById(R.id.lols);
                amount = itemView.findViewById(R.id.omgs);
                myImage = itemView.findViewById(R.id.nahh);
            }else if (type.equals("two")){
                lbl = itemView.findViewById(R.id.nameOfCategories);
                myImgTwo = itemView.findViewById(R.id.categoImg);
            }else if (type.equals("three")){
                lbl = itemView.findViewById(R.id.itemName);
                myImgTwo = itemView.findViewById(R.id.itemImg);
            }


        }

        @Override
        public void onClick(View view) {
            if (type.equals("two")){
                listener.onClick(view,getAdapterPosition());
            }else if (type.equals("three")){
                listener.onClick(view,getAdapterPosition());
            }

        }
    }




















}
