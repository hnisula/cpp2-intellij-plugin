// This is a generated file. Not intended for manual editing.
package org.hnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import org.hnisula.cpp2plugin.Cpp2NamedDeclaration;

public interface Cpp2ValueDecl extends Cpp2NamedDeclaration {

  @Nullable
  Cpp2Expr getExpr();

  @Nullable
  Cpp2TypeSpecifier getTypeSpecifier();

  @Nullable
  PsiElement getContext();

}
