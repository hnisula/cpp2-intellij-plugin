// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.model.psi.PsiSymbolReference;
import java.util.Collection;

public interface Cpp2Identifier extends Cpp2Expr {

  @Nullable
  Cpp2Scope getScope();

  @NotNull
  Collection<PsiSymbolReference> getOwnReferences();

}
