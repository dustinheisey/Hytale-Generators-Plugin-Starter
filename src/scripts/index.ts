import { categories, setGlobal, syncPublic } from "hytale-generators";
import { example } from "./generators/example.ts";

setGlobal({ modId: "ExampleMod", outDir: "../main/resources" });

syncPublic();

categories({ children: [{id: "Example", icon: "Ingots"}] });

example({
  id: "Example",
  color: "#0829af"
});
