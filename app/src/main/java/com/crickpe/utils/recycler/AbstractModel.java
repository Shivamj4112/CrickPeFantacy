package com.crickpe.utils.recycler;

import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.utils.recycler.RecyclerAdapter;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR!\u0010\t\u001a\t\u0018\u00010\n¢\u0006\u0002\b\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/utils/recycler/AbstractModel;", "", "()V", "length", "", "getLength", "()I", "setLength", "(I)V", "onItemClick", "Lcom/crickpe/utils/recycler/RecyclerAdapter$OnItemClick;", "Lkotlinx/android/parcel/RawValue;", "getOnItemClick", "()Lcom/crickpe/utils/recycler/RecyclerAdapter$OnItemClick;", "setOnItemClick", "(Lcom/crickpe/utils/recycler/RecyclerAdapter$OnItemClick;)V", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getViewHolder", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "vpPosition", "getVpPosition", "setVpPosition", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AbstractModel.kt */
public abstract class AbstractModel {
    private transient int length;
    private transient RecyclerAdapter.OnItemClick onItemClick;
    private transient RecyclerView.ViewHolder viewHolder;
    private transient int vpPosition = -1;

    public final int getVpPosition() {
        return this.vpPosition;
    }

    public final void setVpPosition(int i) {
        this.vpPosition = i;
    }

    public final int getLength() {
        return this.length;
    }

    public final void setLength(int i) {
        this.length = i;
    }

    public final RecyclerView.ViewHolder getViewHolder() {
        return this.viewHolder;
    }

    public final void setViewHolder(RecyclerView.ViewHolder viewHolder2) {
        this.viewHolder = viewHolder2;
    }

    public final RecyclerAdapter.OnItemClick getOnItemClick() {
        return this.onItemClick;
    }

    public final void setOnItemClick(RecyclerAdapter.OnItemClick onItemClick2) {
        this.onItemClick = onItemClick2;
    }
}
