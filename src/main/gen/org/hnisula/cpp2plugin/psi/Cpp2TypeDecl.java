// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2TypeDecl extends PsiElement {

  @NotNull
  List<Cpp2MemberDecl> getMemberDeclList();

  @Nullable
  Cpp2TemplateDecl getTemplateDecl();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2TypeDecl, ...)
  //methods are not found in Cpp2PsiUtil

}
