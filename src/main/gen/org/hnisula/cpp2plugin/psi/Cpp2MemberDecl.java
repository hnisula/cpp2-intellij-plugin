// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2MemberDecl extends PsiElement {

  @Nullable
  Cpp2FuncDecl getFuncDecl();

  @Nullable
  Cpp2MemberAccess getMemberAccess();

  @Nullable
  Cpp2TypeDecl getTypeDecl();

  @Nullable
  Cpp2ValueDecl getValueDecl();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2MemberDecl, ...)
  //methods are not found in Cpp2PsiUtil

}
