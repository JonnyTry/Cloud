package z.example.cloud;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView messag;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        messag = itemView.findViewById(R.id.message_item);
    }
}
