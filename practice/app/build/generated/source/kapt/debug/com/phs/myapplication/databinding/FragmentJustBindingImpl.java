package com.phs.myapplication.databinding;
import com.phs.myapplication.R;
import com.phs.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentJustBindingImpl extends FragmentJustBinding implements com.phs.myapplication.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.goal_text, 7);
        sViewsWithIds.put(R.id.assist_text, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener nameTextJustandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.playerData.getValue().name
            //         is viewModel.playerData.getValue().setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(nameTextJust);
            // localize variables for thread safety
            // viewModel.playerData != null
            boolean viewModelPlayerDataJavaLangObjectNull = false;
            // viewModel.playerData.getValue() != null
            boolean viewModelPlayerDataGetValueJavaLangObjectNull = false;
            // viewModel.playerData.getValue().name
            java.lang.String viewModelPlayerDataName = null;
            // viewModel
            com.phs.myapplication.viewModel.JustViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.playerData.getValue()
            com.phs.myapplication.data.Player viewModelPlayerDataGetValue = null;
            // viewModel.playerData
            androidx.lifecycle.LiveData<com.phs.myapplication.data.Player> viewModelPlayerData = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPlayerData = viewModel.getPlayerData();

                viewModelPlayerDataJavaLangObjectNull = (viewModelPlayerData) != (null);
                if (viewModelPlayerDataJavaLangObjectNull) {


                    viewModelPlayerDataGetValue = viewModelPlayerData.getValue();

                    viewModelPlayerDataGetValueJavaLangObjectNull = (viewModelPlayerDataGetValue) != (null);
                    if (viewModelPlayerDataGetValueJavaLangObjectNull) {




                        viewModelPlayerDataGetValue.setName(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public FragmentJustBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentJustBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.assistBtn.setTag(null);
        this.assistNumberTextJust.setTag(null);
        this.backNumberTextJust.setTag(null);
        this.goalBtn.setTag(null);
        this.goalNumberTextJust.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameTextJust.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.phs.myapplication.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.phs.myapplication.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.phs.myapplication.viewModel.JustViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.phs.myapplication.viewModel.JustViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPlayerData((androidx.lifecycle.LiveData<com.phs.myapplication.data.Player>) object, fieldId);
            case 1 :
                return onChangeViewModelAssistData((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPlayerData(androidx.lifecycle.LiveData<com.phs.myapplication.data.Player> ViewModelPlayerData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAssistData(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelAssistData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelPlayerDataBackNumber = 0;
        com.phs.myapplication.data.Player viewModelPlayerDataGetValue = null;
        androidx.lifecycle.LiveData<com.phs.myapplication.data.Player> viewModelPlayerData = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelAssistData = null;
        java.lang.String viewModelPlayerDataName = null;
        java.lang.Integer viewModelAssistDataGetValue = null;
        java.lang.String integerToStringViewModelPlayerDataBackNumber = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelAssistDataGetValue = 0;
        java.lang.String integerToStringViewModelPlayerDataGoal = null;
        java.lang.String integerToStringViewModelAssistData = null;
        int viewModelPlayerDataGoal = 0;
        com.phs.myapplication.viewModel.JustViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.playerData
                        viewModelPlayerData = viewModel.getPlayerData();
                    }
                    updateLiveDataRegistration(0, viewModelPlayerData);


                    if (viewModelPlayerData != null) {
                        // read viewModel.playerData.getValue()
                        viewModelPlayerDataGetValue = viewModelPlayerData.getValue();
                    }


                    if (viewModelPlayerDataGetValue != null) {
                        // read viewModel.playerData.getValue().backNumber
                        viewModelPlayerDataBackNumber = viewModelPlayerDataGetValue.getBackNumber();
                        // read viewModel.playerData.getValue().name
                        viewModelPlayerDataName = viewModelPlayerDataGetValue.getName();
                        // read viewModel.playerData.getValue().goal
                        viewModelPlayerDataGoal = viewModelPlayerDataGetValue.getGoal();
                    }


                    // read Integer.toString(viewModel.playerData.getValue().backNumber)
                    integerToStringViewModelPlayerDataBackNumber = java.lang.Integer.toString(viewModelPlayerDataBackNumber);
                    // read Integer.toString(viewModel.playerData.getValue().goal)
                    integerToStringViewModelPlayerDataGoal = java.lang.Integer.toString(viewModelPlayerDataGoal);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.assistData
                        viewModelAssistData = viewModel.getAssistData();
                    }
                    updateLiveDataRegistration(1, viewModelAssistData);


                    if (viewModelAssistData != null) {
                        // read viewModel.assistData.getValue()
                        viewModelAssistDataGetValue = viewModelAssistData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.assistData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAssistDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAssistDataGetValue);


                    // read Integer.toString(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.assistData.getValue()))
                    integerToStringViewModelAssistData = java.lang.Integer.toString(androidxDatabindingViewDataBindingSafeUnboxViewModelAssistDataGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.assistBtn.setOnClickListener(mCallback2);
            this.goalBtn.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.nameTextJust, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, nameTextJustandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.assistNumberTextJust, integerToStringViewModelAssistData);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.backNumberTextJust, integerToStringViewModelPlayerDataBackNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.goalNumberTextJust, integerToStringViewModelPlayerDataGoal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextJust, viewModelPlayerDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.phs.myapplication.viewModel.JustViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.plusAssist();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.phs.myapplication.viewModel.JustViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.incrementGoal();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.playerData
        flag 1 (0x2L): viewModel.assistData
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}