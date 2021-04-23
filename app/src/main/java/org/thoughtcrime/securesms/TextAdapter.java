package org.thoughtcrime.securesms;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.SimpleTextHolder> {

    List<StarredMessage> strMsg;
    public TextAdapter(){
    }

    public TextAdapter(List<StarredMessage> strMsg) {
        this.strMsg = strMsg;
    }

    @Override
    public SimpleTextHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.starred_message_view, parent, false);
        return new SimpleTextHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleTextHolder holder, int position) {
        holder.itemTitle.setText(strMsg.get(position).getStarredMessage());
    }


    @Override
    public int getItemCount() {
        return strMsg.size();
    }

    class SimpleTextHolder extends RecyclerView.ViewHolder {

        TextView itemTitle;

        SimpleTextHolder(View itemView) {
            super(itemView);

            itemTitle = itemView.findViewById(R.id.textView2);

        }

    }

}
