import '@testing-library/jest-dom/vitest';
import { render, screen } from "@testing-library/react";
import React from 'react';
import { describe, expect, it } from 'vitest';
import { App } from '../src/App';

describe("App", () => {
  it("renders the App", () => {
    render(<App />);

    expect(screen.getByText("XPUG Trento")).toBeInTheDocument();
  });
});
