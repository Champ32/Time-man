// Generated by view binder compiler. Do not edit!
package com.example.timeman.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.timeman.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView Alreadyregistered;

  @NonNull
  public final MaterialButton SignUpbtn;

  @NonNull
  public final EditText password;

  @NonNull
  public final EditText password2;

  @NonNull
  public final TextView signin;

  @NonNull
  public final EditText username;

  private ActivitySignupBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView Alreadyregistered, @NonNull MaterialButton SignUpbtn,
      @NonNull EditText password, @NonNull EditText password2, @NonNull TextView signin,
      @NonNull EditText username) {
    this.rootView = rootView;
    this.Alreadyregistered = Alreadyregistered;
    this.SignUpbtn = SignUpbtn;
    this.password = password;
    this.password2 = password2;
    this.signin = signin;
    this.username = username;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Alreadyregistered;
      TextView Alreadyregistered = ViewBindings.findChildViewById(rootView, id);
      if (Alreadyregistered == null) {
        break missingId;
      }

      id = R.id.SignUpbtn;
      MaterialButton SignUpbtn = ViewBindings.findChildViewById(rootView, id);
      if (SignUpbtn == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.password2;
      EditText password2 = ViewBindings.findChildViewById(rootView, id);
      if (password2 == null) {
        break missingId;
      }

      id = R.id.signin;
      TextView signin = ViewBindings.findChildViewById(rootView, id);
      if (signin == null) {
        break missingId;
      }

      id = R.id.username;
      EditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new ActivitySignupBinding((RelativeLayout) rootView, Alreadyregistered, SignUpbtn,
          password, password2, signin, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
