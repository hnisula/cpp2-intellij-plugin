// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2ObjAliasDecl extends PsiElement {

  @NotNull
  Cpp2Expr getExpr();

  @NotNull
  Cpp2Identifier getIdentifier();

  @Nullable
  Cpp2TypeSpecifier getTypeSpecifier();

  //WARNING: getContext(...) is skipped
  //matching getContext(Cpp2ObjAliasDecl, ...)
  //methods are not found in Cpp2PsiUtil

}
