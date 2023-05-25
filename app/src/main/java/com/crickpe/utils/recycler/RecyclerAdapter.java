package com.crickpe.utils.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0002:;B\u000f\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0016J\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0013\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u0006H\u0016J\u001f\u0010(\u001a\u00020\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u001e\u0010-\u001a\u00020\u00162\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010%\u001a\u00020\u0006H\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0006H\u0016J\u0013\u00103\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J*\u00106\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001608J\u001d\u00109\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010)R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, mo48222d2 = {"Lcom/crickpe/utils/recycler/RecyclerAdapter;", "T", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/utils/recycler/RecyclerAdapter$VH;", "layoutId", "", "(I)V", "inflater", "Landroid/view/LayoutInflater;", "items", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "lastPosition", "getLastPosition", "()I", "setLastPosition", "getLayoutId", "onItemClick", "Lcom/crickpe/utils/recycler/RecyclerAdapter$OnItemClick;", "addItem", "", "item", "isAnim", "", "(Lcom/crickpe/utils/recycler/AbstractModel;Z)V", "addItems", "", "append", "newItems", "delete", "index", "(Ljava/lang/Integer;)V", "deleteAll", "getAllItems", "getItemAt", "position", "(I)Lcom/crickpe/utils/recycler/AbstractModel;", "getItemCount", "insertAt", "(Ljava/lang/Integer;Lcom/crickpe/utils/recycler/AbstractModel;)V", "moveItem", "fromPosition", "toPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "(Lcom/crickpe/utils/recycler/AbstractModel;)V", "setOnItemClick", "swapItem", "swapped", "Lkotlin/Function1;", "updateItem", "OnItemClick", "VH", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecyclerAdapter.kt */
public final class RecyclerAdapter<T extends AbstractModel> extends RecyclerView.Adapter<C1211VH<T>> {
    private LayoutInflater inflater;
    private final ArrayList<T> items = new ArrayList<>();
    private int lastPosition = -1;
    private final int layoutId;
    private OnItemClick onItemClick;

    @Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo48222d2 = {"Lcom/crickpe/utils/recycler/RecyclerAdapter$OnItemClick;", "", "onClick", "", "view", "Landroid/view/View;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "type", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecyclerAdapter.kt */
    public interface OnItemClick {
        void onClick(View view, RecyclerView.ViewHolder viewHolder, String str);
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public RecyclerAdapter(int i) {
        this.layoutId = i;
    }

    public final int getLastPosition() {
        return this.lastPosition;
    }

    public final void setLastPosition(int i) {
        this.lastPosition = i;
    }

    public final ArrayList<T> getItems() {
        return this.items;
    }

    public final T getItemAt(int i) {
        T t = this.items.get(i);
        Intrinsics.checkNotNullExpressionValue(t, "items[position]");
        return (AbstractModel) t;
    }

    public static /* synthetic */ void delete$default(RecyclerAdapter recyclerAdapter, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        recyclerAdapter.delete(num);
    }

    public final void delete(Integer num) {
        int size = this.items.size() - 1;
        ArrayList<T> arrayList = this.items;
        if (num != null) {
            size = num.intValue();
        }
        arrayList.remove(size);
        notifyDataSetChanged();
    }

    public final void deleteAll() {
        int size = this.items.size();
        this.items.clear();
        notifyItemRangeRemoved(0, size);
    }

    public final void moveItem(int i, int i2) {
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(this.items, i3, i4);
                i3 = i4;
            }
        } else {
            int i5 = i2 + 1;
            if (i5 <= i) {
                int i6 = i;
                while (true) {
                    Collections.swap(this.items, i6, i6 - 1);
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                }
            }
        }
        notifyItemMoved(i, i2);
    }

    public final void swapItem(int i, int i2, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "swapped");
        T t = this.items.get(i);
        Intrinsics.checkNotNullExpressionValue(t, "items[fromPosition]");
        ArrayList<T> arrayList = this.items;
        arrayList.set(i, arrayList.get(i2));
        this.items.set(i2, (AbstractModel) t);
        notifyItemChanged(i2);
        function1.invoke(true);
    }

    public final void updateItem(Integer num, T t) {
        Intrinsics.checkNotNullParameter(t, "item");
        if (num != null && num.intValue() < this.items.size()) {
            this.items.set(num.intValue(), t);
            notifyItemChanged(num.intValue());
        }
    }

    public static /* synthetic */ void insertAt$default(RecyclerAdapter recyclerAdapter, Integer num, AbstractModel abstractModel, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        recyclerAdapter.insertAt(num, abstractModel);
    }

    public final void insertAt(Integer num, T t) {
        Intrinsics.checkNotNullParameter(t, "item");
        ArrayList<T> arrayList = this.items;
        arrayList.add(num != null ? num.intValue() : arrayList.size(), t);
        notifyItemInserted(num != null ? num.intValue() : this.items.size() - 1);
    }

    public static /* synthetic */ void addItem$default(RecyclerAdapter recyclerAdapter, AbstractModel abstractModel, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        recyclerAdapter.addItem(abstractModel, z);
    }

    public final void addItem(T t, boolean z) {
        Intrinsics.checkNotNullParameter(t, "item");
        this.items.add(t);
        notifyItemInserted(this.items.size() - 1);
    }

    public final void removeItem(T t) {
        Intrinsics.checkNotNullParameter(t, "item");
        this.items.remove(t);
        notifyDataSetChanged();
    }

    public final void append(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "newItems");
        int size = this.items.size();
        this.items.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public final void addItems(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnItemClick(OnItemClick onItemClick2) {
        this.onItemClick = onItemClick2;
    }

    public final ArrayList<T> getAllItems() {
        return this.items;
    }

    public C1211VH<T> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        ViewDataBinding inflate = DataBindingUtil.inflate(layoutInflater, this.layoutId, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "binding");
        return new C1211VH<>(inflate);
    }

    public int getItemCount() {
        return this.items.size();
    }

    public void onBindViewHolder(C1211VH<T> vh, int i) {
        Intrinsics.checkNotNullParameter(vh, "holder");
        vh.setIsRecyclable(false);
        T t = this.items.get(i);
        Intrinsics.checkNotNullExpressionValue(t, "items[position]");
        AbstractModel abstractModel = (AbstractModel) t;
        abstractModel.setViewHolder(vh);
        abstractModel.setLength(getItemCount());
        OnItemClick onItemClick2 = this.onItemClick;
        if (onItemClick2 != null) {
            abstractModel.setOnItemClick(onItemClick2);
        }
        vh.bind(abstractModel);
    }

    @Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo48222d2 = {"Lcom/crickpe/utils/recycler/RecyclerAdapter$VH;", "T", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "model", "(Lcom/crickpe/utils/recycler/AbstractModel;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* renamed from: com.crickpe.utils.recycler.RecyclerAdapter$VH */
    /* compiled from: RecyclerAdapter.kt */
    public static final class C1211VH<T extends AbstractModel> extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1211VH(ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewDataBinding, "binding");
            this.binding = viewDataBinding;
        }

        public final void bind(T t) {
            Intrinsics.checkNotNullParameter(t, "model");
            this.binding.executePendingBindings();
        }
    }
}
