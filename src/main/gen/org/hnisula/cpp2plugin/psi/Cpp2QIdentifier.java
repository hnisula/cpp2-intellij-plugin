// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2QIdentifier extends Cpp2Expr {

  @NotNull
  List<Cpp2Identifier> getIdentifierList();

  @NotNull
  List<Cpp2Template> getTemplateList();

  @Nullable
  PsiElement getContext();

}
