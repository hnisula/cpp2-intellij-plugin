// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2FuncCall extends Cpp2Expr {

  @NotNull
  List<Cpp2Arg> getArgList();

  @Nullable
  Cpp2Scope getScope();

  @Nullable
  Cpp2Template getTemplate();

}
