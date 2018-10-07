package android.example.com.foodshare.adapters;

import android.example.com.foodshare.utils.OnItemClickListener;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.example.com.foodshare.R;
/**
 * Created by Ramakrishna on 12/08/2015.
 */


public class DonationsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtDetails,txtDistance,txtAddress;
    OnItemClickListener clickListener;

    public DonationsViewHolder(View itemView,OnItemClickListener itemClickListener) {
        super(itemView);

        txtAddress = (TextView) itemView.findViewById(R.id.txt_address);
        txtDetails = (TextView) itemView.findViewById(R.id.txt_details);
        txtDistance = (TextView) itemView.findViewById(R.id.txt_distance);

        itemView.setOnClickListener(this);
        clickListener = itemClickListener;

    }

    @Override
    public void onClick(View v) {
        clickListener.onItemClick(v, getLayoutPosition());
    }
}

