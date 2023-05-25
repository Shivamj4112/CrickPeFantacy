package com.crickpe.base.presentation.extensions;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.p004os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

@Metadata(mo48221d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001ar\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042R\u0010\u0005\u001a*\u0012&\b\u0001\u0012\"\u0012\u0016\u0012\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00070\u0006\"\"\u0012\u0016\u0012\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\b¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r¨\u0006\u000f"}, mo48222d2 = {"startActivity", "", "T", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Context;", "params", "", "Lkotlin/Pair;", "Lkotlin/reflect/KProperty1;", "", "(Landroid/content/Context;[Lkotlin/Pair;)V", "toast", "resId", "", "length", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContextExtensions.kt */
public final class ContextExtensionsKt {
    public static /* synthetic */ void toast$default(Context context, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        toast(context, i, i2);
    }

    public static final void toast(Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast.makeText(context, context.getString(i), i2).show();
    }

    public static final /* synthetic */ <T extends AppCompatActivity> void startActivity(Context context, Pair<? extends KProperty1<? extends Object, ? extends Object>, ? extends Object>... pairArr) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "params");
        Collection arrayList = new ArrayList(pairArr.length);
        for (Pair<? extends KProperty1<? extends Object, ? extends Object>, ? extends Object> pair : pairArr) {
            Pair pair2 = pair;
            arrayList.add(TuplesKt.m276to(((KProperty1) pair.getFirst()).getName(), pair.getSecond()));
        }
        Collection collection = (List) arrayList;
        Collection collection2 = collection;
        Object[] array = collection.toArray(new Pair[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Pair[] pairArr2 = (Pair[]) array;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<AppCompatActivity> cls = AppCompatActivity.class;
        Class cls2 = cls;
        Intent intent = new Intent(context, cls);
        intent.putExtras(BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
        context.startActivity(intent);
    }
}
