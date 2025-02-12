// Generated by view binder compiler. Do not edit!
package com.example.timeman.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.timeman.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button7;

  @NonNull
  public final CalendarView calendarView3;

  @NonNull
  public final ConstraintLayout coordinatorLayout;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMain3Binding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull Button button5, @NonNull Button button7, @NonNull CalendarView calendarView3,
      @NonNull ConstraintLayout coordinatorLayout, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.button3 = button3;
    this.button5 = button5;
    this.button7 = button7;
    this.calendarView3 = calendarView3;
    this.coordinatorLayout = coordinatorLayout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.calendarView3;
      CalendarView calendarView3 = ViewBindings.findChildViewById(rootView, id);
      if (calendarView3 == null) {
        break missingId;
      }

      ConstraintLayout coordinatorLayout = (ConstraintLayout) rootView;

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMain3Binding((ConstraintLayout) rootView, button3, button5, button7,
          calendarView3, coordinatorLayout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
